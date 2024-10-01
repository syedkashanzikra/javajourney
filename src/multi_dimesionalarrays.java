public class multi_dimesionalarrays {
    public static void main(String[] args) {
        //in this we use multi dimesional arrays
        // means array of arrays and also can be more arrays init
        //for a 1d array structure
        int[]marks ;
        //for 2d array structure
   /*     int[][] flats;
        flats =new int[2][3];
         //            |  |
        //             V  V
        //    (floors)column|Rows(Houses)
        flats[0][0] =101;
        flats[0][1] =102;
        flats[0][2] =103;
        flats[1][0] =201;
        flats[1][1] =202;
        flats[1][2] =203;

        //now for printing we use nested for loop
        for (int i =0 ;i<flats.length;i++){
            for (int j =0;j< flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
*/
        //3d array with looped data

                int[][][] flats = new int[2][3][2];

                // Fill the 3D array with some values
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 2; k++) {
                            flats[i][j][k] = (i + 1) * 100 + (j + 1) * 10 + k + 1;
                        }
                    }
                }

                // Print the 3D array
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 2; k++) {
                            System.out.print("flats[" + i + "][" + j + "][" + k + "] = " + flats[i][j][k] + "  ");
                        }
                        System.out.println();
                    }
                }
            }
        }



