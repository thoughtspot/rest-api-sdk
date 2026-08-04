# flake8: noqa

if __import__("typing").TYPE_CHECKING:
    # import apis into api package
    from thoughtspot_rest_api_sdk.api.ai_api import AIApi
    from thoughtspot_rest_api_sdk.api.authentication_api import AuthenticationApi
    from thoughtspot_rest_api_sdk.api.collections_api import CollectionsApi
    from thoughtspot_rest_api_sdk.api.connection_configurations_api import ConnectionConfigurationsApi
    from thoughtspot_rest_api_sdk.api.connections_api import ConnectionsApi
    from thoughtspot_rest_api_sdk.api.custom_action_api import CustomActionApi
    from thoughtspot_rest_api_sdk.api.custom_calendars_api import CustomCalendarsApi
    from thoughtspot_rest_api_sdk.api.dbt_api import DBTApi
    from thoughtspot_rest_api_sdk.api.data_api import DataApi
    from thoughtspot_rest_api_sdk.api.email_customization_api import EmailCustomizationApi
    from thoughtspot_rest_api_sdk.api.groups_api import GroupsApi
    from thoughtspot_rest_api_sdk.api.jobs_api import JobsApi
    from thoughtspot_rest_api_sdk.api.log_api import LogApi
    from thoughtspot_rest_api_sdk.api.manual_translation_api import ManualTranslationApi
    from thoughtspot_rest_api_sdk.api.metadata_api import MetadataApi
    from thoughtspot_rest_api_sdk.api.orgs_api import OrgsApi
    from thoughtspot_rest_api_sdk.api.reports_api import ReportsApi
    from thoughtspot_rest_api_sdk.api.roles_api import RolesApi
    from thoughtspot_rest_api_sdk.api.schedules_api import SchedulesApi
    from thoughtspot_rest_api_sdk.api.security_api import SecurityApi
    from thoughtspot_rest_api_sdk.api.style_customization_api import StyleCustomizationApi
    from thoughtspot_rest_api_sdk.api.system_api import SystemApi
    from thoughtspot_rest_api_sdk.api.tags_api import TagsApi
    from thoughtspot_rest_api_sdk.api.thought_spot_rest_api import ThoughtSpotRestApi
    from thoughtspot_rest_api_sdk.api.users_api import UsersApi
    from thoughtspot_rest_api_sdk.api.variable_api import VariableApi
    from thoughtspot_rest_api_sdk.api.version_control_api import VersionControlApi
    from thoughtspot_rest_api_sdk.api.webhooks_api import WebhooksApi
    
else:
    from lazy_imports import LazyModule, as_package, load

    load(
        LazyModule(
            *as_package(__file__),
            """# import apis into api package
from thoughtspot_rest_api_sdk.api.ai_api import AIApi
from thoughtspot_rest_api_sdk.api.authentication_api import AuthenticationApi
from thoughtspot_rest_api_sdk.api.collections_api import CollectionsApi
from thoughtspot_rest_api_sdk.api.connection_configurations_api import ConnectionConfigurationsApi
from thoughtspot_rest_api_sdk.api.connections_api import ConnectionsApi
from thoughtspot_rest_api_sdk.api.custom_action_api import CustomActionApi
from thoughtspot_rest_api_sdk.api.custom_calendars_api import CustomCalendarsApi
from thoughtspot_rest_api_sdk.api.dbt_api import DBTApi
from thoughtspot_rest_api_sdk.api.data_api import DataApi
from thoughtspot_rest_api_sdk.api.email_customization_api import EmailCustomizationApi
from thoughtspot_rest_api_sdk.api.groups_api import GroupsApi
from thoughtspot_rest_api_sdk.api.jobs_api import JobsApi
from thoughtspot_rest_api_sdk.api.log_api import LogApi
from thoughtspot_rest_api_sdk.api.manual_translation_api import ManualTranslationApi
from thoughtspot_rest_api_sdk.api.metadata_api import MetadataApi
from thoughtspot_rest_api_sdk.api.orgs_api import OrgsApi
from thoughtspot_rest_api_sdk.api.reports_api import ReportsApi
from thoughtspot_rest_api_sdk.api.roles_api import RolesApi
from thoughtspot_rest_api_sdk.api.schedules_api import SchedulesApi
from thoughtspot_rest_api_sdk.api.security_api import SecurityApi
from thoughtspot_rest_api_sdk.api.style_customization_api import StyleCustomizationApi
from thoughtspot_rest_api_sdk.api.system_api import SystemApi
from thoughtspot_rest_api_sdk.api.tags_api import TagsApi
from thoughtspot_rest_api_sdk.api.thought_spot_rest_api import ThoughtSpotRestApi
from thoughtspot_rest_api_sdk.api.users_api import UsersApi
from thoughtspot_rest_api_sdk.api.variable_api import VariableApi
from thoughtspot_rest_api_sdk.api.version_control_api import VersionControlApi
from thoughtspot_rest_api_sdk.api.webhooks_api import WebhooksApi

""",
            name=__name__,
            doc=__doc__,
        )
    )
