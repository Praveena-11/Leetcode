/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    const words = s.split(" ");
    if(pattern.length!==words.length) return false;

    const map1=new Map();
    const map2=new Map();

    for(let i=0;i<pattern.length;i++){
        const c=pattern[i];
        const w=words[i];

        if(map1.has(c)){
            if(map1.get(c)!==w)return false;
        }else{
            if(map2.has(w))return false;
            map1.set(c,w);
            map2.set(w,c);
        }
    }
    return true;
};