

# GCPWebIdentitySetup

Setup information for GCP clusters using STS AssumeRoleWithWebIdentity. ThoughtSpot will use its GCP service account to obtain OIDC tokens for AWS access. Example: {   \"thoughtspot_gcp_service_account_id\": \"115663769112811637952\",   \"oidc_provider\": \"accounts.google.com\",   \"trust_policy_template\": {     \"Version\": \"2012-10-17\",     \"Statement\": [{       \"Effect\": \"Allow\",       \"Principal\": { \"Federated\": \"arn:aws:iam::YOUR_AWS_ACCOUNT_ID:oidc-provider/accounts.google.com\" },       \"Action\": \"sts:AssumeRoleWithWebIdentity\",       \"Condition\": { \"StringEquals\": { \"accounts.google.com:sub\": \"115663769112811637952\" } }     }]   },   \"setup_instructions\": [     \"1. Add accounts.google.com as an Identity Provider in AWS IAM\",     \"2. Create an IAM role with Web Identity Federation trust\",     \"3. Configure the trust policy with ThoughtSpot's GCP service account ID\",     \"4. Attach S3 permissions (s3:PutObject, s3:PutObjectAcl) to the role\",     \"5. Use the role ARN in your webhook storage configuration\"   ] }

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**thoughtspotGcpServiceAccountId** | **String** | ThoughtSpot&#39;s GCP service account unique ID (numeric). This is the &#39;sub&#39; claim in OIDC tokens and must be included in your IAM role&#39;s trust policy condition. Example: \&quot;115663769112811637952\&quot; |  |
|**oidcProvider** | **String** | The OIDC identity provider URL. For GCP, this is always &#39;accounts.google.com&#39;. You must configure this as an Identity Provider in AWS IAM. Example: \&quot;accounts.google.com\&quot; |  [optional] |
|**trustPolicyTemplate** | **Object** | Sample IAM trust policy JSON object for Web Identity Federation. This policy allows ThoughtSpot&#39;s GCP service account to assume your AWS role. Example: { \&quot;Version\&quot;: \&quot;2012-10-17\&quot;, \&quot;Statement\&quot;: [{ \&quot;Effect\&quot;: \&quot;Allow\&quot;, \&quot;Principal\&quot;: { \&quot;Federated\&quot;: \&quot;arn:aws:iam::YOUR_AWS_ACCOUNT_ID:oidc-provider/accounts.google.com\&quot; }, \&quot;Action\&quot;: \&quot;sts:AssumeRoleWithWebIdentity\&quot;, \&quot;Condition\&quot;: { \&quot;StringEquals\&quot;: { \&quot;accounts.google.com:sub\&quot;: \&quot;115663769112811637952\&quot; } } }] } |  |
|**setupInstructions** | **List&lt;String&gt;** | Step-by-step instructions to configure AWS for GCP Web Identity Federation. Example: [\&quot;1. Add accounts.google.com as an Identity Provider in AWS IAM\&quot;, \&quot;2. Create an IAM role with Web Identity Federation trust\&quot;] |  [optional] |


## Implemented Interfaces

* Serializable


