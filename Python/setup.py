# -*- coding: utf-8 -*-

import sys
from setuptools import setup, find_packages

if sys.version_info[0] < 3:
    with open('README.md', 'r') as fh:
        long_description = fh.read()
else:
    with open('README.md', 'r', encoding='utf-8') as fh:
        long_description = fh.read()

setup(
    name='thoughtspot-rest-api-sdk',
    version='1.6.6',
    description='Python client library for RESTAPI SDK',
    long_description=long_description,
    long_description_content_type="text/markdown",
    author='ThoughtSpot',
    author_email='support@thoughtspot.com',
    url='https://github.com/thoughtspot/rest-api-sdk/tree/main/Python',
    packages=find_packages(),
    install_requires=[
        'jsonpickle~=1.4, >= 1.4.1',
        'requests~=2.24',
        'cachecontrol~=0.12.6',
        'python-dateutil~=2.8.1',
        'enum34~=1.1, >=1.1.10'
    ],
    tests_require=[
        'nose>=1.3.7'
    ],
    test_suite = 'nose.collector'
)
