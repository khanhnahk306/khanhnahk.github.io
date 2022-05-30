function checkElement(numbers, number) {
    for(let i=0;i <numbers.length;i++){
        if(numbers[i] !== number){
            return false;
        }else return true;
    }
}
let num = [1,2,3,4,5,6];
let number = 6;
checkElement(num, n)