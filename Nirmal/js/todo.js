const txtReminder = document.querySelector('#reminder')
const btnCreate = document.querySelector('#create')
const reminders =  document.querySelector('#reminders')
function btnCreateClickEventHandler(){
    let reminder = txtReminder.value
    console.log(reminder)
    createReminder(reminder)
}
function createReminder(text){
    const divReminder = document.createElement('div')
    divReminder.classList.add('reminder')
    divReminder.textContent = text
    // reminders.appendChild(divReminder)
    reminders.insertBefore(divReminder, reminders.firstChild)
    console.log(divReminder)
const radiobtn = document.createElement('input')
radiobtn.type = "radio"
divReminder.appendChild(radiobtn)
radiobtn.addEventListener('click', remove)
function remove(){
    reminders.removeChild(divReminder)
}
}
btnCreate.addEventListener('click', btnCreateClickEventHandler)
