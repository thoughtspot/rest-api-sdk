# %%
import json
import os
import requests
import shutil

# %%
output = []
with open(os.path.abspath(os.path.join(os.getcwd(),'api-spec','openapiSpecv3-2_0.json')), 'r') as fr:
    data = json.loads(fr.read())

i = 0
if os.path.exists(os.path.abspath(os.path.join(os.getcwd(),'Python','controllers'))):
    shutil.rmtree(os.path.abspath(os.path.join(os.getcwd(),'Python','controllers')))

if os.path.exists(os.path.abspath(os.path.join(os.getcwd(),'Python','models'))):
    shutil.rmtree(os.path.abspath(os.path.join(os.getcwd(),'Python','models')))

controllers_init_all = []
models_init_all = []
restapisdk_imports = {}

for end_point, request_type in data['paths'].items():
    end_point = end_point


    models_output_dir = os.path.abspath(os.path.join(os.getcwd(),'Python','models'))
    controllers_output_dir = os.path.abspath(os.path.join(os.getcwd(),'Python','controllers'))
        
    # Remove all files in the output directory
    if not os.path.exists(models_output_dir):
        os.makedirs(models_output_dir)

    # Remove all files in the output directory
    if not os.path.exists(controllers_output_dir):
        os.makedirs(controllers_output_dir)
    
    if not os.path.exists(os.path.abspath(os.path.join(controllers_output_dir, 'base_controller.py'))):
        with open(os.path.abspath(os.path.join(controllers_output_dir, 'base_controller.py')), 'a') as file:
            file.write('class BaseController():\n\tdef __init__(self, config,):\n\t\tself.config = config')
            file.close()
    if not os.path.exists(os.path.abspath(os.path.join(controllers_output_dir, end_point.replace('-','_').replace('{','').replace('}','').split('/')[4] + '_controller.py'))):
        with open(os.path.abspath(os.path.join(controllers_output_dir, end_point.replace('-','_').replace('{','').replace('}','').split('/')[4] + '_controller.py')), 'a') as file:
            file.write('from models import *\nfrom utilities.api_helper import APIHelper\nimport requests\nfrom controllers.base_controller import BaseController\nclass ' + str.capitalize(end_point.replace('-','_').replace('{','').replace('}','').split('/')[4]) + 'Controller(BaseController):\n\tdef __init__(self, config,):\n\t\tsuper(' + str.capitalize(end_point.replace('-','_').replace('{','').replace('}','').split('/')[4]) + 'Controller, self).__init__(config,)\n')
            file.close()

    restapisdk_imports[end_point.replace('-','_').replace('{','').replace('}','').split('/')[4] + '_controller'] = str.capitalize(end_point.replace('-','_').replace('{','').replace('}','').split('/')[4]) + 'Controller'

    # Request Function Defintion Initialization
    request_function_definition = ''
    
    # Class Name for the Request Input Parameter
    class_name = [str.capitalize(x) for x in end_point.replace('-','_').replace('_','/').replace('{','').replace('}','').split('/')[4:]]

    request_parameter_class_imports = ''

    controllers_init_all.append(end_point.replace('-','_').replace('{','').replace('}','').split('/')[4] + '_controller')

    # Request Class Definition Intialization
    request_parameter_class_definition = 'class ' + "".join(class_name) + 'Request():\n'

    # Request Class __init__ Definition
    request_parameter_class_init__definition = '\tdef __init__(self,'


    # Request Class __init__ Definition
    request_parameter_class_required_parameters = ''


    # Request Class __init__ Definition
    request_parameter_class_optional_parameters = ''

    # Names Definition
    request_parameter_class_names = "\t_names = {" 

    # Request Function Definition Body
    request_parameter_class_definition_body = ''

    # Request Class Definition Body
    request_parameter_class_definition_documentation = "\n\t\t'''\n\t\tArgs:"
    

    request_type_name = list(request_type.keys())[0].lower()
    requests_statement = "\trequest = requests." + request_type_name + '('
    for request_type_details in request_type.values():
        if request_type_name == 'post':

            if end_point.__contains__('{'):
                request_function_definition += '\tdef ' + request_type_details['operationId'] + "(self, " + end_point.split('{')[1].split('}')[0] + ": str, body: " + "".join(class_name) + 'Request' + "):\n\t\tend_point = f'" + end_point + "'\n\t\turl: str = self.config.base_url + end_point\n\t\theaders: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}\n\t\tdata: dict = APIHelper.to_dictionary(body)\n\t\tssl_flag: bool = self.config.skip_ssl_cert_verification\n\t\tresponse: requests.Response = requests.post(url=url, headers=headers, json=data, verify=ssl_flag)\n\t\tif response.status_code == 200:\n\t\t\treturn response.json()\n\t\telif response.status_code == 204:\n\t\t\treturn 'Success'\n\t\telse:\n\t\t\tresponse.raise_for_status()\n\t\t\treturn\n"    
            else:
                request_function_definition += '\tdef ' + request_type_details['operationId'] + "(self, body: " + "".join(class_name) + 'Request' + "):\n\t\tend_point = '" + end_point + "'\n\t\turl: str = self.config.base_url + end_point\n\t\theaders: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}\n\t\tdata: dict = APIHelper.to_dictionary(body)\n\t\tssl_flag: bool = self.config.skip_ssl_cert_verification\n\t\tresponse: requests.Response = requests.post(url=url, headers=headers, json=data, verify=ssl_flag)\n\t\tif response.status_code == 200:\n\t\t\treturn response.json()\n\t\telif response.status_code == 204:\n\t\t\treturn 'Success'\n\t\telse:\n\t\t\tresponse.raise_for_status()\n\t\t\treturn\n"
            comments = request_type_details['description']
            try:
                request_body = request_type_details['requestBody']
            except:
                with open(os.path.abspath(os.path.join(controllers_output_dir, end_point.replace('-','_').replace('{','').replace('}','').split('/')[4] + '_controller.py')), 'a') as file:
                    file.write(request_function_definition.replace(" body: " + "".join(class_name) + 'Request', '').replace("\n\t\tdata: dict = APIHelper.to_dictionary(body)", '').replace(', json=data',''))
                    file.close()
                continue
            models_init_all.append("".join(class_name) + 'Request')

            try:
                required_parameters = request_body['content']['application/json']['schema']['required']
            except:
                required_parameters = []
            for input_parameter, input_parameter_details in request_body['content']['application/json']['schema']['properties'].items():
                input_parameter = input_parameter
                request_parameter_class_names += "'" + input_parameter + "':'"+ input_parameter + "',"
                if input_parameter in required_parameters:
                    request_parameter_class_required_parameters += input_parameter + ','
                else:
                    request_parameter_class_optional_parameters += input_parameter + '=None,'
                try:
                    input_parameter_description = input_parameter_details['description'].replace('\n',' ')
                except:
                    input_parameter_description = ''
                try:
                    input_parameter_type = input_parameter_details['type']
                except:
                    input_parameter_type = input_parameter_details['$ref'].split('/')[-1]
                request_parameter_class_definition_documentation += '\n\t\t' + input_parameter + ' (' + input_parameter_type
                request_parameter_class_definition_body += '\n\t\tself.' + input_parameter + ' = ' + input_parameter
                if input_parameter_type == 'array':
                    try:
                        request_parameter_class_definition_documentation += '<' + input_parameter_details['items']['type'] + '>): ' + input_parameter_description
                        if request_parameter_class_definition_documentation[-1] != '.':
                                request_parameter_class_definition_documentation += '.'
                        try:
                            request_parameter_class_definition_documentation += ' The acceptable values are: ' + ", ".join(input_parameter_details['items']['enum'])
                        except:
                            pass
                    except:
                        reference_identifier = input_parameter_details['items']['$ref'].split('/')
                        request_parameter_class_definition_documentation += '<' + reference_identifier[-1] + '>): ' + input_parameter_description
                        if request_parameter_class_definition_documentation[-1] != '.':
                                request_parameter_class_definition_documentation += '.'
                else:
                    request_parameter_class_definition_documentation += '): ' + input_parameter_description
                    if request_parameter_class_definition_documentation[-1] != '.':
                                request_parameter_class_definition_documentation += '.'
            request_parameter_class_definition_documentation += "\n\t\t'''"
            request_parameter_class_init__definition += request_parameter_class_required_parameters + request_parameter_class_optional_parameters + '):'
            request_parameter_class_definition_body += '\n'
            request_parameter_class_names += '}\n'
            with open(os.path.join(models_output_dir, "".join(class_name)+'Request.py'), 'a') as outfile:
                outfile.write(request_parameter_class_definition)
                outfile.write(request_parameter_class_names)
                outfile.write(request_parameter_class_init__definition)
                outfile.write(request_parameter_class_definition_documentation)
                outfile.write(request_parameter_class_definition_body)
        elif request_type_name == 'get':
            if end_point.__contains__('{'):
                request_function_definition += '\tdef ' + request_type_details['operationId'] + "(self, " + end_point.split('{')[1].split('}')[0] + ": str):\n\t\tend_point = f'" + end_point + "'\n\t\turl: str = self.config.base_url + end_point\n\t\theaders: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}\n\t\tssl_flag: bool = self.config.skip_ssl_cert_verification\n\t\tresponse: requests.Response = requests.post(url=url, headers=headers, verify=ssl_flag)\n\t\tresponse.raise_for_status()\n\t\treturn response.json()\n"    
            else:
                request_function_definition += '\tdef ' + request_type_details['operationId'] + "(self,):\n\t\tend_point = '" + end_point + "'\n\t\turl: str = self.config.base_url + end_point\n\t\theaders: dict = {'Accept': self.config.accept_language, 'Content-Type': self.config.content_type, 'Authorization': self.config.access_token}\n\t\tssl_flag: bool = self.config.skip_ssl_cert_verification\n\t\tresponse: requests.Response = requests.post(url=url, headers=headers, verify=ssl_flag)\n\t\tresponse.raise_for_status()\n\t\treturn response.json()\n"
        else:
            print()
            print('Failure')
            print()
        with open(os.path.abspath(os.path.join(controllers_output_dir, end_point.replace('-','_').replace('{','').replace('}','').split('/')[4] + '_controller.py')), 'a') as file:
            file.write(request_function_definition)
            file.close()
        
with open(os.path.abspath(os.path.join(controllers_output_dir,'__init__.py')),'a') as c:
    c.write('__all__ = ')
    c.write("['" + "','".join(list(set(controllers_init_all))) + "']")
with open(os.path.abspath(os.path.join(models_output_dir,'__init__.py')),'a') as m:
    m.write('__all__ = ')
    m.write("['" + "','".join(list(set(models_init_all))) + "']")
with open(os.path.abspath(os.path.join(os.getcwd(),'Python','thoughtspot_rest_api_sdk.py')), 'w') as f:
    f.write('from utilities.decorators import lazy_property\nfrom utilities.configuration import Configuration\nfrom utilities.configuration import Environment\nfrom typing import Dict, Any\nimport requests\n')
    for key, value in restapisdk_imports.items():
        f.write('from controllers.' + key + ' import ' + value + '\n')
    f.write('class ThoughtSpotRestApiSdk(object):\n')
    for value in restapisdk_imports.values():
        f.write('\t@lazy_property\n\tdef ' + value.split('Controller')[0].lower() + '(self):\n\t\t' + 'return ' + value + '(self.config)\n')
    f.write("\tdef __init__(self, http_client_instance=None,\n\t\t\t\toverride_http_client_configuration=False, http_call_back=None,\n\t\t\t\ttimeout=60, max_retries=0, backoff_factor=2,\n\t\t\t\tretry_statuses=[408, 413, 429, 500, 502, 503, 504, 521, 522, 524, 408, 413, 429, 500, 502, 503, 504, 521, 522, 524],\n\t\t\t\tretry_methods=['GET', 'PUT', 'GET', 'PUT'],\n\t\t\t\tenvironment=Environment.PRODUCTION,\n\t\t\t\tbase_url='https://localhost:443', access_token='',\n\t\t\t\taccept_language='application/json',\n\t\t\t\tcontent_type='application/json',\n\t\t\t\tskip_ssl_cert_verification=False, config=None):\n\t\tif config is None:\n\t\t\tself.config = Configuration(\n\t\t\t\t\t\t\t\t\t\thttp_client_instance=http_client_instance,\n\t\t\t\t\t\t\t\t\t\toverride_http_client_configuration=override_http_client_configuration,\n\t\t\t\t\t\t\t\t\t\thttp_call_back=http_call_back,\n\t\t\t\t\t\t\t\t\t\ttimeout=timeout,\n\t\t\t\t\t\t\t\t\t\tmax_retries=max_retries,\n\t\t\t\t\t\t\t\t\t\tbackoff_factor=backoff_factor,\n\t\t\t\t\t\t\t\t\t\tretry_statuses=retry_statuses,\n\t\t\t\t\t\t\t\t\t\tretry_methods=retry_methods,\n\t\t\t\t\t\t\t\t\t\tenvironment=environment,\n\t\t\t\t\t\t\t\t\t\tbase_url=base_url,\n\t\t\t\t\t\t\t\t\t\taccess_token=access_token,\n\t\t\t\t\t\t\t\t\t\taccept_language=accept_language,\n\t\t\t\t\t\t\t\t\t\tcontent_type=content_type,\n\t\t\t\t\t\t\t\t\t\tskip_ssl_cert_verification=skip_ssl_cert_verification)\n\t\telse:\n\t\t\tself.config = config\n\t\t\t\n\tdef login(self, user_name: str, password: str, validity_time: int = 14400) -> None:\n\t\t'''\n\t\tLogs in to the ThoughtSpot server and obtains an authentication token.\n\t\t'''\n\t\tend_point: str = '/api/rest/2.0/auth/token/full'\n\t\turl: str = self.config.base_url + end_point\n\t\theaders: Dict[str, str] = {'Accept': 'application/json', 'Content-Type': 'application/json'}\n\t\tdata: Dict[str, Any] = {'username': user_name, 'password': password, 'validity_time_in_sec': validity_time}\n\t\tresponse: requests.Response = requests.post(url, headers=headers, json=data, verify=self.config.skip_ssl_cert_verification)\n\t\tresponse.raise_for_status()\n\t\tself.config.access_token: str = 'Bearer ' + response.json()['token']")


