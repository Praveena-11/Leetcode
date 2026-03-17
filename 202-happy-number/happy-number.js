/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    function getNextNumber(n){
    let output =0;
    while(n>0){
        let digit = n%10;
        output += digit * digit;
        n=Math.floor(n/10);
    }
    return output;
    }
    let slow = getNextNumber(n);
    let fast = getNextNumber(getNextNumber(n));

    while(slow !==fast){
        if(fast === 1) return true;
        slow = getNextNumber(slow);
        fast = getNextNumber(getNextNumber(fast));
    }
    return slow ===1;
};