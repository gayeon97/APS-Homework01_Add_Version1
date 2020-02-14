Add (Version 1)
===============
#Author of the problem: Professor Joanna Klukowska at NYU Courant
##Algorithmic Problem Solving, Spring 2020
######Student: Gayeon Park

Write a program that reads two integers from standard input, calculates their sum and prints the result to standard output.

**Input**
Two integer values -1,000,000,000 <= v1, v2 <= -1,000,000,000 each on its own line.

**Output**
A single value that is the sum of v1 and v2 followed by a newline.

**Example 1:**
```
Input:
4
9

Output:
13
```

**Example 2:**
```
Input:
-5
5

Output:
0
```


Here are sample solutions to this problem in C, C++ and Java:
```
#include <stdio.h>

int main() {
    int a,b;
    scanf("%d %d",&a, &b);
    printf("%d\n",a+b);
    return 0;
}
```

```
#include <iostream>

using namespace std;

int main() {
    int a,b;
    cin >> a >> b;
    cout << a+b << endl;
    return 0;
}
```

```
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a + b);
    }
}
```

**Suggestion 1**: write all three solutions on your own and submit them to the autograder - don’t just copy and paste.

**Suggestion 2**: if you are unfamiliar with one of the above languages, study its solution carefully and make sure you
understand each line of the code.
