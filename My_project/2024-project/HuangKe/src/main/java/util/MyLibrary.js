// 对数组求和，并返回
let getArrSum = function (arr) {
    return arr.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
}

// 求解一元二次方程的解，并返回
let getSolve = function (a, b, c) {
    const discriminant = b * b - 4 * a * c;

    if (discriminant > 0) {
        const root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        const root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return [root1, root2]; // 返回根作为数组
    } else if (discriminant === 0) {
        const root = -b / (2 * a);
        return [root]; // 返回单个根作为数组
    } else {
        return []; // 如果根是虚数，则返回空数组
    }
}

// 数组排序，并返回
let sortArray = function (arr) {
    // 使用sort方法对数组进行排序
    return arr.slice().sort((a, b) => a - b);
}