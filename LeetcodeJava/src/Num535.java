public class Num535 {
    public static void main(String[] args) {
        Codec codec = new Codec();
        String url = "https://leetcode.com/problems/design-tinyurl";
        codec.decode(codec.encode(url));
        System.out.println(codec.url);
    }

    public static class Codec {
        String url;

        public Codec() {
            this.url = "";
        }

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            this.url = longUrl;
            return longUrl;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return this.url;
        }
    }

}
