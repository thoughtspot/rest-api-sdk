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
    version='1.13.1',
    description='Python client library for ThoughtSpot Public REST API',
    long_description=long_description,
    long_description_content_type="text/markdown",
    author='APIMatic SDK Generator',
    author_email='support@apimatic.io',
    url='https://apimatic.io',
    packages=find_packages(),
    install_requires=[
        'apimatic-core~=0.1.0',
        'apimatic-core-interfaces~=0.1.0',
        'apimatic-requests-client-adapter~=0.1.0',
        'python-dateutil~=2.8.1',
        'enum34~=1.1, >=1.1.10'
    ],
    tests_require=[
        'pytest>=7.1.3'
    ],
)