package pract_2.zd10;

public class HowMany {
    private String string;
    private int wordSum;

    HowMany(String string){
        this.string=string;
    }

    private void wordFinding(){
        int localeSum=0;
        for(int i = 1; i<this.string.length()-1;i++){
            if(this.string.charAt(i-1)==' '&& this.string.charAt(i+1)!=' '){
                localeSum++;
            }
        }
        setWordSum(localeSum);
    }

    public void setWordSum(int wordSum) {
        this.wordSum = wordSum;
    }

    public int getWordSum() {
        return wordSum;
    }
}
