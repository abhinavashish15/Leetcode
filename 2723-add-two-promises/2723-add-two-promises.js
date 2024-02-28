/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    let result = 0;
  result += (await promise1).valueOf();
  result += (await promise2).valueOf();

  return result;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */

// async function addTwoPromises(promise1: Promise<number>, promise2: Promise<number>): Promise<number> {
// let result: number = 0;
//   result += (await promise1).valueOf();
//   result += (await promise2).valueOf();

//   return result;
// };