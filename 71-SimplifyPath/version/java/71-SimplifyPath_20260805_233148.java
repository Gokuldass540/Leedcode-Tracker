// Last updated: 8/5/2026, 11:31:48 PM
1class Solution {
2    public String simplifyPath(String path) {
3        Stack<String> stack = new Stack<>(); // create a stack to keep track of directories
4        String[] directories = path.split("/"); // split the path by slash '/'
5        for (String dir : directories) { // iterate over the directories
6            if (dir.equals(".") || dir.isEmpty()) { // ignore the current directory '.' and empty directories
7                continue;
8            } else if (dir.equals("..")) { // go one level up for double period '..'
9                if (!stack.isEmpty()) { // if stack is not empty, pop the top element
10                    stack.pop();
11                }
12            } else { // for any other directory, push it to the stack
13                stack.push(dir);
14            }
15        }
16        return "/" + String.join("/", stack); // join the directories in the stack with slash '/' and add a slash at the beginning
17    }
18}