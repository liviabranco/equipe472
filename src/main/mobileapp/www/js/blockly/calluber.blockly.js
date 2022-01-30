window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Calluber = window.blockly.js.blockly.Calluber || {};

/**
 * calluber
 */
window.blockly.js.blockly.Calluber.calluberArgs = [];
window.blockly.js.blockly.Calluber.calluber = async function() {
 var item;
  this.cronapi.cordova.geolocation.getCurrentPosition(async function(sender_item) {
      item = sender_item;
    this.cronapi.notification.customNotify('error', 'Você chamou um Uber, tarifas variáveis foram aceitas e seu contato de emergencia recebeu uma mensagem.', 'fade', 'top', 'left', 'true');
  }.bind(this), async function(sender_item) {
      item = sender_item;
  }.bind(this));
}
