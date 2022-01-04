# Heroku


## Basic Commands

* To login :
```bash
heroku login
```

* To view list of all available apps :
```bash
heroku apps
```

* To Run any Django command :
```bash
heroku run <Django Command> -a <Heroku application name>
```

Eg:
```bash
heroku run python manage.py createsuperuser -a savior19-staging
```
