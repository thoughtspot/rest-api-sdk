# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper
from restapisdk.models.pdf_options_input import PdfOptionsInput


class TspublicRestV2ReportLiveboardRequest(object):

    """Implementation of the 'Tspublic Rest V2 Report Liveboard Request' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the Liveboard to download.    This field is
            considered only when no input is provided for transientContent
            field.
        viz_id (list of string): JSON Array of GUIDs of the visualizations in
            the Liveboard to be included in the downloaded file.    For CSV,
            XLSX and PNG file download, visualization id is mandatory. CSV and
            XLSX is valid only for visualization of type table and PNG is
            valid for charts.    Only one value will be accepted for these
            formats. If multiple values are provided then first value in the
            array will be considered.
        transient_content (string): If you have embedded ThoughtSpot in your
            host application, and you want to download Liveboards with unsaved
            changes as a file, pass the transient content from the browser
            fetch request, using the getExportRequestForCurrentPinboard
            method. For more information, see
            https://developers.thoughtspot.com/docs/?pageid=liveboard-export-ap
            i#transient-pinboard.
        runtime_filter (string): JSON object which contains filter condition
            to filter the data at the time of data retrieval.    Example:
            {"col1":"region","op1":"EQ","val1":"northeast","col2":"date","op2":
            "BET","val2":["1625126400000","1625126400000"]}    For more
            information, see
            https://developers.thoughtspot.com/docs/?pageid=runtime-filters
        runtime_sort (string): JSON object which provides columns to sort the
            data at the time of data retrieval.    Example:
            {"sortCol1":"region","asc1":true,"sortCol2":"date"}    For more
            information, see
            https://developers.thoughtspot.com/docs/?pageid=runtime-filters
        mtype (LiveboardReportTypeEnum): Type of file to be generated.
        pdf_options (PdfOptionsInput): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "mtype": 'type',
        "id": 'id',
        "viz_id": 'vizId',
        "transient_content": 'transientContent',
        "runtime_filter": 'runtimeFilter',
        "runtime_sort": 'runtimeSort',
        "pdf_options": 'pdfOptions'
    }

    _optionals = [
        'id',
        'viz_id',
        'transient_content',
        'runtime_filter',
        'runtime_sort',
        'pdf_options',
    ]

    def __init__(self,
                 mtype='PDF',
                 id=APIHelper.SKIP,
                 viz_id=APIHelper.SKIP,
                 transient_content=APIHelper.SKIP,
                 runtime_filter=APIHelper.SKIP,
                 runtime_sort=APIHelper.SKIP,
                 pdf_options=APIHelper.SKIP):
        """Constructor for the TspublicRestV2ReportLiveboardRequest class"""

        # Initialize members of the class
        if id is not APIHelper.SKIP:
            self.id = id 
        if viz_id is not APIHelper.SKIP:
            self.viz_id = viz_id 
        if transient_content is not APIHelper.SKIP:
            self.transient_content = transient_content 
        if runtime_filter is not APIHelper.SKIP:
            self.runtime_filter = runtime_filter 
        if runtime_sort is not APIHelper.SKIP:
            self.runtime_sort = runtime_sort 
        self.mtype = mtype 
        if pdf_options is not APIHelper.SKIP:
            self.pdf_options = pdf_options 

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

        mtype = dictionary.get("type") if dictionary.get("type") else 'PDF'
        id = dictionary.get("id") if dictionary.get("id") else APIHelper.SKIP
        viz_id = dictionary.get("vizId") if dictionary.get("vizId") else APIHelper.SKIP
        transient_content = dictionary.get("transientContent") if dictionary.get("transientContent") else APIHelper.SKIP
        runtime_filter = dictionary.get("runtimeFilter") if dictionary.get("runtimeFilter") else APIHelper.SKIP
        runtime_sort = dictionary.get("runtimeSort") if dictionary.get("runtimeSort") else APIHelper.SKIP
        pdf_options = PdfOptionsInput.from_dictionary(dictionary.get('pdfOptions')) if 'pdfOptions' in dictionary.keys() else APIHelper.SKIP 
        # Return an object of this model
        return cls(mtype,
                   id,
                   viz_id,
                   transient_content,
                   runtime_filter,
                   runtime_sort,
                   pdf_options)
