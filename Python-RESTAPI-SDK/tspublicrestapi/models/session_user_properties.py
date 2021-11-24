# -*- coding: utf-8 -*-

"""
tspublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class SessionUserProperties(object):

    """Implementation of the 'SessionUserProperties' model.

    TODO: type model description here.

    Attributes:
        persona (string): Persona of the user account
        mail (string): Email of the user account

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "persona": 'persona',
        "mail": 'mail'
    }

    def __init__(self,
                 persona=None,
                 mail=None):
        """Constructor for the SessionUserProperties class"""

        # Initialize members of the class
        self.persona = persona
        self.mail = mail

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
        persona = dictionary.get('persona')
        mail = dictionary.get('mail')

        # Return an object of this model
        return cls(persona,
                   mail)