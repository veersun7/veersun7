const txtReminder = document.querySelector('#reminder')
const btnCreate = document.querySelector('#create')
const reminders =  document.querySelector('#reminders')

function btnCreateClickEventHandler(){
    let reminder = txtReminder.value
    console.log(reminder)
    createReminder(reminder)
}

function deleteReminder(event){
    console.log(event.target)
    console.log(event.target.parentElement)
    }

function createReminder(text){
    const divReminder = document.createElement('div')
    const radio = document.createElement('input')
    radio.type  ='radio'
    radio.name = 'done'
    const span = document.createElement('span')
    radio.addEventListener('click', deleteReminder)
    
    divReminder.classList.add('reminder')
    span.textContent = text
    divReminder.appendChild(radio)
    divReminder.appendChild(span)
   
    reminders.insertBefore(divReminder, reminders.firstChild)
    console.log(divReminder)
}

btnCreate.addEventListener('click', btnCreateClickEventHandler)
