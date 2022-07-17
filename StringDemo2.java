public class StringDemo2 {
    public static void main(String[] args) {
       StringBuffer sb=new StringBuffer();
       sb.append("java");
       sb.append("my");
       sb.append("favourite");
       sb.append("programming");
       sb.insert(4,"is");
        System.out.println("sb content is"+sb);
    }
}
