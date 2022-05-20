import swagger_client
from swagger_client import TipoDeGusto
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient())

try:
    api_response = api_instance.gustos_get(tipo=TipoDeGusto.CREMAS)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->gustos_get: %s\n" % e)
