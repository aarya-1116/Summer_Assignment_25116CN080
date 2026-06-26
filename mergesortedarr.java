public class mergesortedarr{
    public static void main(String[] args) {
      int[] arr1={1,2,4,7};
      int[] arr2={3,5,6,8};
      int i=0,j=0,k=0;
      int[] merged=new int[arr1.length+arr2.length];
      while(i<arr1.length && j<arr2.length ){
        if(arr1[i]<arr2[j]){
            merged[k]=arr1[i];
            i++;
        }
        else{
            merged[k]=arr2[j];
            j++;
        }
        k++;
      }
      while(i<arr1.length){
        merged[k]=arr1[i];
        i++;
        k++;
      }
      while(j<arr2.length){
        merged[k]=arr2[j];
        j++;
        k++;
      }
      System.out.println("Merged array:");
      for(int l=0;l<merged.length;l++){
        System.out.print(merged[l]+" ");
      }
    }
}