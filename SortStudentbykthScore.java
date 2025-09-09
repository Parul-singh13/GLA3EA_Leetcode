public int[][] sortTheStudents(int[][] score, int k) {
        int len=score.length;
        for(int i=0;i<len;i++){
          for(int j=i+1; j<len;j++){
               if (score[i][k]<score[j][k]){
                int[] temp= score[i];
                score[i]=score[j];
                score[j]=temp;
                   
              }
            }
        }
       // Arrays.sort(score,(a,b) -> Integer.compare(b[k],a[k]));
        return score;
        }
