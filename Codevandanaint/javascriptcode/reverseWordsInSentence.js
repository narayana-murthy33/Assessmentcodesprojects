function reverseWordsInSentence(sentence) {

    let words = [];
    let word = '';
    for (let char of sentence) {
        if (char === ' ') {
            words.push(word);
            word = '';
        } else {
            word += char;
        }
    }
    words.push(word);

    
    let reversedWords = [];
    for (let word of words) {
        reversedWords.push(reverseWord(word));
    }


    let reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

function reverseWord(word) {
    let reversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
        reversed += word[i];
    }
    return reversed;
}

let input = "This is a sunny day";
let reversedSentence = reverseWordsInSentence(input);
console.log(reversedSentence);
