type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };

function argumentsLength(...args: JSONValue[]): number {
    var count = 0;
    for (var i = 0; i < args.length; i++) {
        count++;
    }
    return count;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */