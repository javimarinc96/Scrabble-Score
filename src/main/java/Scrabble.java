class Scrabble {

    private String word;
    
    Scrabble(String word) {
        this.word=word;
    }

    int getScore() {
        int res = 0;
        char[] chars = this.word.toCharArray();
        
        for(char c : chars){
            switch(c){
                case 'A','E','I','O','U','L','N','R','S','T',
                    'a','e','i','o','u','l','n','r','s','t':
                    res += 1;
                    break;
                case 'D','G','d','g':
                    res += 2;
                    break;
                case 'B','C','M','P','b','c','m','p':
                    res += 3;
                    break;
                case 'F','H','V','W','Y','f','h','v','w','y':
                    res += 4;
                    break;
                case 'K','k':
                    res += 5;
                    break;
                case 'J','X','j','x':
                    res += 8;
                    break;
                case 'Q','Z','q','z':
                    res += 10;
                    break;
                default:
                    res += 0;
                    break;
            }
        }
        return res;
    }

}
