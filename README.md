plugin-dotcms-actionlet-setvalue 
=====================

This plugin provides a Workflow Actionlet that can set a value on the contentlet that has been passed in before the contentlet is persisted.

It takes two parameters

1. field: is the velocityVar name of the field you want to set
2. value: is either a string or velocity that sets the value you want to set it to.  


The value field will be evaluated in velocity and the object that is set as $value will be used to set the field value.  If  $value is not set via velocity, then the whole string of the value field will be used to set the contentlet's value (too many values....)


Example, to set "publishDate" - a date field's value to tomorrow, you can write in the value field:
```
#set($value = $date.calendar)

## Add 24 hours (hours=int code 10 - see list below)
$value.add(10,24)

## set value to the date
#set($value = $value.time)
```

This sets $value to a java.util.Date object which is then passed to cantentlet to set the value of the contentlet publishDate field.

