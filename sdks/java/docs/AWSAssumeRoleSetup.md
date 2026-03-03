

# AWSAssumeRoleSetup

Setup information for AWS clusters using STS AssumeRole. ThoughtSpot will use its AWS IAM role to assume your role in your AWS account. Example: {   \"thoughtspot_aws_account_id\": \"123456789012\",   \"trust_policy_template\": {     \"Version\": \"2012-10-17\",     \"Statement\": [{       \"Effect\": \"Allow\",       \"Principal\": { \"AWS\": \"arn:aws:iam::123456789012:root\" },       \"Action\": \"sts:AssumeRole\",       \"Condition\": { \"StringEquals\": { \"sts:ExternalId\": \"your-external-id\" } }     }]   },   \"setup_instructions\": [     \"1. Create an IAM role in your AWS account\",     \"2. Copy the trust policy template and attach it to your role\",     \"3. Attach S3 permissions (s3:PutObject, s3:PutObjectAcl) to the role\",     \"4. Use the role ARN in your webhook storage configuration\"   ] }

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**thoughtspotAwsAccountId** | **String** | ThoughtSpot&#39;s AWS Account ID. You must include this in your IAM role&#39;s trust policy to allow ThoughtSpot to assume your role. Example: \&quot;123456789012\&quot; |  |
|**trustPolicyTemplate** | **Object** | Sample IAM trust policy JSON object that you should attach to your IAM role. The policy includes ThoughtSpot&#39;s AWS Account ID and your External ID. Example: { \&quot;Version\&quot;: \&quot;2012-10-17\&quot;, \&quot;Statement\&quot;: [{ \&quot;Effect\&quot;: \&quot;Allow\&quot;, \&quot;Principal\&quot;: { \&quot;AWS\&quot;: \&quot;arn:aws:iam::123456789012:root\&quot; }, \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;, \&quot;Condition\&quot;: { \&quot;StringEquals\&quot;: { \&quot;sts:ExternalId\&quot;: \&quot;your-external-id\&quot; } } }] } |  |
|**setupInstructions** | **List&lt;String&gt;** | Step-by-step instructions to configure your AWS IAM role. Example: [\&quot;1. Create an IAM role in your AWS account\&quot;, \&quot;2. Add the trust policy with ThoughtSpot&#39;s AWS Account ID\&quot;] |  [optional] |


## Implemented Interfaces

* Serializable


