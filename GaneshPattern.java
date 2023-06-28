public class GaneshPattern {
    public static void main(String[] args) {
        int n= 7;
        for(int j=0;j<n;j++){
            if(j==0 || j>=n/2){
                System.out.print('*');
            }else{
                System.out.print(' ');
            }
        }
//        System.out.print('\n');
        for(int i=0;i<(2*n-3)/2;i++){
            if(i%2==0){
                System.out.print('\n');
            }else{
                for(int j=0;j<n;j++){
                    if(j==0 || j==n/2){
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.print('*');
        }
        for(int i=0;i<(2*n-3)/2;i++){
            if(i%2==0){
                System.out.print('\n');
            }else{
                for(int j=0;j<n;j++){
                    if(j==n-1 || j==n/2){
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }
                }
            }
        }
        for(int j=0;j<n;j++){
            if(j==n-1 || j<=n/2){
                System.out.print('*');
            }else{
                System.out.print(' ');
            }
        }

    }
}
