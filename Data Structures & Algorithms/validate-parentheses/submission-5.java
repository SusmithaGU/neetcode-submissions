class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        Stack<Character> stack = new Stack();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                stack.push(ch);
            } 
            else if(stack.isEmpty()) return false;
            else {
                    char c = stack.pop();
                    if (map.get(c) != ch)
                        return false;
                
            }
        }

        return stack.isEmpty() && true;
    }
}
