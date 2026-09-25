package basicproblems;

public class Strstr{

        public static int subStringFinder(String s,String x){
            int index = -1,flag=0;
            for(int i = 0;i<s.length();i++){
                int l=i;
                if(s.charAt(i)==x.charAt(0)){
                    for(int j = 0;j<x.length();j++){
                        if(l<s.length() && x.charAt(j)==s.charAt(l)){
                            l++;
                            flag=1;
                        }
                        else{
                            flag=0;
                            break;
                        }
                    }

                    if(flag==1){
                        index=i;
                        return index;
                    }
                }
            }
            return index;
        }

    public static void main(String[] args) {
        String s = "GeeksFor";
        String x = "For";
        int res=subStringFinder(s,x);

        if(res != -1){
            System.out.println("Substring starts at :"+res);
        }
        if(res == -1){
            System.out.println("No substring:"+res);
        }
    }

}

