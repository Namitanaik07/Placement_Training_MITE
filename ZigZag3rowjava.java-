public class ZigZag3rowjava {
    public static void main(String args[]){
        String str="PAYPALISHIRING";
        int r=3;
        char arr[][]=new char[r][str.length()];
        int row=0;
        boolean down=true;
        for(int i=0;i<str.length();i++){
            arr[row][i]=str.charAt(i);
            if(down){
                row++;
            } else{
                row--;
            }
            if(row==r){
                down=false;
                row=row-2;
            }
            if(row<0){
                down=true;
                row=row+2;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<str.length();j++){
                if(arr[i][j]==0){
                    System.out.print(" ");
                } else{
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }   

    }
}
