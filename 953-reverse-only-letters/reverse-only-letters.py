class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        arr=list(s)
        r=0
        e=len(s)-1
        while r<e:
            if not arr[r].isalpha(): 
                r+=1
            elif not arr[e].isalpha():
                e-=1
            else:
                arr[r],arr[e]=arr[e],arr[r]
                r+=1
                e-=1
        return ''.join(arr)

