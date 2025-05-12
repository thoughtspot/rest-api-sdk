

# CommitResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**committer** | [**CommiterType**](CommiterType.md) |  |  [optional] |
|**author** | [**AuthorType**](AuthorType.md) |  |  [optional] |
|**comment** | **String** | Comments associated with the commit |  [optional] |
|**commitTime** | **String** | Time at which the changes were committed. |  [optional] |
|**commitId** | **String** | SHA id associated with the commit |  [optional] |
|**branch** | **String** | Branch where changes were committed |  [optional] |
|**committedFiles** | [**List&lt;CommitFileType&gt;**](CommitFileType.md) | Files that were pushed as part of this commit |  [optional] |


## Implemented Interfaces

* Serializable


