# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.group_name_and_id_input import GroupNameAndIDInput


class TspublicRestV2UserCreateRequest(object):

    """Implementation of the 'Tspublic Rest V2 User Create Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the user account. The username string must be
            unique.
        display_name (string): A display name string for the user, usually
            their first and last name.
        visibility (CreateUserVisibilityEnum): Visibility of the user. The
            visibility attribute is set to DEFAULT when creating a user.   
            The DEFAULT attribute makes a user visible to other users and user
            groups, and thus allows them to share objects.
        mail (string): Email id associated with the user account
        password (string): Password for the user account.
        groups (list of GroupNameAndIDInput): A JSON array of group names or
            GUIDs or both. When both are given then id is considered
        state (CreateUserStateEnum): Status of user account. acitve or
            inactive.
        notify_on_share (CreateUserNotifyOnShareEnum): User preference for
            receiving email notifications when another ThoughtSpot user shares
            answers or pinboards.
        show_walk_me (CreateUserShowWalkMeEnum): The user preference for
            revisiting the onboarding experience.
        analyst_onboarding_complete (CreateUserAnalystOnboardingCompleteEnum):
            ThoughtSpot provides an interactive guided walkthrough to onboard
            new users. The onboarding experience leads users through a set of
            actions to help users get started and accomplish their tasks
            quickly.    The users can turn off the Onboarding experience and
            access it again when they need assistance with the ThoughtSpot
            UI.
        mtype (CreateUserTypeEnum): Type of user. LOCAL_USER indicates that
            the user is created locally in the ThoughtSpot system.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "display_name": 'displayName',
        "password": 'password',
        "visibility": 'visibility',
        "mail": 'mail',
        "groups": 'groups',
        "state": 'state',
        "notify_on_share": 'notifyOnShare',
        "show_walk_me": 'showWalkMe',
        "analyst_onboarding_complete": 'analystOnboardingComplete',
        "mtype": 'type'
    }

    def __init__(self,
                 name=None,
                 display_name=None,
                 password=None,
                 visibility='DEFAULT',
                 mail=None,
                 groups=None,
                 state='ACTIVE',
                 notify_on_share='true',
                 show_walk_me='true',
                 analyst_onboarding_complete='false',
                 mtype='LOCAL_USER'):
        """Constructor for the TspublicRestV2UserCreateRequest class"""

        # Initialize members of the class
        self.name = name
        self.display_name = display_name
        self.visibility = visibility
        self.mail = mail
        self.password = password
        self.groups = groups
        self.state = state
        self.notify_on_share = notify_on_share
        self.show_walk_me = show_walk_me
        self.analyst_onboarding_complete = analyst_onboarding_complete
        self.mtype = mtype

    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object
            as obtained from the deserialization of the server's response. The
            keys MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary

        name = dictionary.get('name')
        display_name = dictionary.get('displayName')
        password = dictionary.get('password')
        visibility = dictionary.get("visibility") if dictionary.get("visibility") else 'DEFAULT'
        mail = dictionary.get('mail')
        groups = None
        if dictionary.get('groups') is not None:
            groups = [GroupNameAndIDInput.from_dictionary(x) for x in dictionary.get('groups')]
        state = dictionary.get("state") if dictionary.get("state") else 'ACTIVE'
        notify_on_share = dictionary.get("notifyOnShare") if dictionary.get("notifyOnShare") else 'true'
        show_walk_me = dictionary.get("showWalkMe") if dictionary.get("showWalkMe") else 'true'
        analyst_onboarding_complete = dictionary.get("analystOnboardingComplete") if dictionary.get("analystOnboardingComplete") else 'false'
        mtype = dictionary.get("type") if dictionary.get("type") else 'LOCAL_USER'
        # Return an object of this model
        return cls(name,
                   display_name,
                   password,
                   visibility,
                   mail,
                   groups,
                   state,
                   notify_on_share,
                   show_walk_me,
                   analyst_onboarding_complete,
                   mtype)
