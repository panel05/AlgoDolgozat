package dolgozat;
public class Dolgozat {
 final int[] tomb = {1, 23, 3, 44, 4,5, 7, 2,55, 56};
    public static void main(String[] args) {
        rendezes(int tomb[], int csere);
        
        
    }
    public int[] rendezes(int tomb[], int csere){
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i+1]; j++) {
                csere = tomb[j];
                if(tomb[i] > csere){
                    tomb[i] = csere;
                }
            }
            
        }
        return tomb;
        kiiras(int[] tomb);
    }
    
    public void kiiras(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
    }
}
