# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper


class PdfOptionsInput(object):

    """Implementation of the 'pdfOptionsInput' model.

    TODO: type model description here.

    Attributes:
        orientation (PdfOptionsInputOrientationEnum): Page orientation for the
            PDF. Default: PORTRAIT
        truncate_tables (PdfOptionsInputTruncateTablesEnum): When set to true,
            only the first page of the tables is displayed in the file.   This
            setting is applicable only when generating report for specific
            visualization ids. Default: false
        include_logo (PdfOptionsInputIncludeLogoEnum): Include customized wide
            logo if available in the footer. Default: true
        footer_text (string): Footer text to include in the footer of each
            page of the PDF.
        include_page_number (PdfOptionsInputIncludePageNumberEnum): When set
            to true, the page number is included in the footer of each page.
            Default: true
        include_cover_page (PdfOptionsInputIncludeCoverPageEnum): When set to
            true, a cover page with the Liveboard title is added in the PDF.
            Default: true
        include_filter_page (PdfOptionsInputIncludeFilterPageEnum): When set
            to true, a second page with a list of all applied filters is added
            in the PDF. Default: true

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "orientation": 'orientation',
        "truncate_tables": 'truncateTables',
        "include_logo": 'includeLogo',
        "footer_text": 'footerText',
        "include_page_number": 'includePageNumber',
        "include_cover_page": 'includeCoverPage',
        "include_filter_page": 'includeFilterPage'
    }

    _optionals = [
        'orientation',
        'truncate_tables',
        'include_logo',
        'footer_text',
        'include_page_number',
        'include_cover_page',
        'include_filter_page',
    ]

    def __init__(self,
                 orientation='PORTRAIT',
                 truncate_tables='false',
                 include_logo='true',
                 footer_text=APIHelper.SKIP,
                 include_page_number='true',
                 include_cover_page='true',
                 include_filter_page='true'):
        """Constructor for the PdfOptionsInput class"""

        # Initialize members of the class
        self.orientation = orientation 
        self.truncate_tables = truncate_tables 
        self.include_logo = include_logo 
        if footer_text is not APIHelper.SKIP:
            self.footer_text = footer_text 
        self.include_page_number = include_page_number 
        self.include_cover_page = include_cover_page 
        self.include_filter_page = include_filter_page 

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

        orientation = dictionary.get("orientation") if dictionary.get("orientation") else 'PORTRAIT'
        truncate_tables = dictionary.get("truncateTables") if dictionary.get("truncateTables") else 'false'
        include_logo = dictionary.get("includeLogo") if dictionary.get("includeLogo") else 'true'
        footer_text = dictionary.get("footerText") if dictionary.get("footerText") else APIHelper.SKIP
        include_page_number = dictionary.get("includePageNumber") if dictionary.get("includePageNumber") else 'true'
        include_cover_page = dictionary.get("includeCoverPage") if dictionary.get("includeCoverPage") else 'true'
        include_filter_page = dictionary.get("includeFilterPage") if dictionary.get("includeFilterPage") else 'true'
        # Return an object of this model
        return cls(orientation,
                   truncate_tables,
                   include_logo,
                   footer_text,
                   include_page_number,
                   include_cover_page,
                   include_filter_page)
