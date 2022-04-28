
# PostVerificationKeyBankModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The verification key&#39;s type. | 
**algorithm** | [**inline**](#Algorithm) | The verification key&#39;s algorithm. | 
**publicKey** | **kotlin.String** | DER encoded public key in Base64 format. | 
**nonce** | **kotlin.String** | Value signed in the **signature** field. | 
**signature** | **kotlin.String** | Signature on **nonce** using PKCS1v15 padding and the SHA512 hashing algorithm in Base64 format. | 


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | attestation


<a name="Algorithm"></a>
## Enum: algorithm
Name | Value
---- | -----
algorithm | RS512



