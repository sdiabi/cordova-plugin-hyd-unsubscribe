var exec = require('cordova/exec');

var Unsubscribe = function () {};

Unsubscribe.start = function () {
    exec(null, null, "Unsubscribe", "start", []);
};

module.exports = Unsubscribe;