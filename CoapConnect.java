public static void main( String[] args )
{

NetworkConfig.getStandard()
	.setInt(NetworkConfig.Keys.MAX_MESSAGE_SIZE, 64)
	.setInt(NetworkConfig.Keys.PREFERRED_BLOCK_SIZE, 64);
URI uri = null; // URI parameter of the request

// input URI from command line arguments
try {
	uri = new URI("coap://[aaaa::212:7402:2:202]:5683");
} catch (URISyntaxException e) {
	System.err.println("Invalid URI: " + e.getMessage());
	System.exit(-1);
}

CoapClient client = new CoapClient(uri);

CoapResponse response = client.get();

System.out.println(response.getResponseText());
}
