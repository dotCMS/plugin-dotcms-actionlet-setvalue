plugin-dotcms-email 
=====================

This plugin provides a Workflow Actionlet that can set a value on the contentlet that has been passed in,  

It takes two parameters

1. field name: is the velocityVar name of the field you want to set
2. value: is either a string or velocity that sets the value you want to set it to.  


The value field will be evaluated in velocity and the object that is set as $value will be used to set the field value.  If  $value is not set via velocity, then the whole string will be used as the value to set..

Example, to set a date field's value to tomorrow, you can write:
```
#set($value = $date.calendar)

## Add 24 hours (hours=int code 10 - see list below)
$value.add(10,24)

## set value to the date
#set($value = $value.time)
```
