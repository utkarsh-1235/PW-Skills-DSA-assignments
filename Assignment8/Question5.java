public class Question5 {

        public static int compress(char[] chars) {
            int writeIndex = 0;
            int i = 0;
    
            while (i < chars.length) {
                int j = i + 1;
                while (j < chars.length && chars[j] == chars[i]) {
                    j++;
                }
    
                chars[writeIndex] = chars[i];
                writeIndex++;
    
                int groupSize = j - i;
                if (groupSize > 1) {
                    String groupSizeStr = String.valueOf(groupSize);
                    for (char c : groupSizeStr.toCharArray()) {
                        chars[writeIndex] = c;
                        writeIndex++;
                    }
                }
    
                i = j;
            }
    
            return writeIndex;
        }
    
        public static void main(String[] args) {
            char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
            int newLength = compress(chars);
            System.out.println("New length: " + newLength);
            for (int i = 0; i < newLength; i++) {
                System.out.print(chars[i] + " ");
            }
        }
    }
     

