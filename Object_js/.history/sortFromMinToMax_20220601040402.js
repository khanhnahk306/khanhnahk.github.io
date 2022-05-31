function sortFromMinToMaxme(arr) {
    arr.sort(function(a,b) {
        return a.price - b.price;
    })
}