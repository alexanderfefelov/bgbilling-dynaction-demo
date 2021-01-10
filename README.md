# bgbilling-dynaction-demo

## Как это установить?

Склонируйте этот репозиторий:

```
git clone https://github.com/alexanderfefelov/bgbilling-dynaction-demo
```

Скопируйте содержимое каталога `dyn` в каталог `dyn` вашего экземпляра BGBilling.

## Привет, мир!

В конфигурацию ядра добавьте:

```
# Dynaction: Привет, мир!
# 
dynaction:DemoDynaction.ActionHelloWorld=com.github.alexanderfefelov.bgbilling.dynaction.demo.HelloWorld
#         │           │       │        │ │                                                             │
#         └─────┬─────┘       └───┬────┘ └──────────────────────────────┬──────────────────────────────┘
#               │                 │                                     │
#             module            action                                class
```

### Вызов HTTP GET

```
http --verbose --check-status \
  GET http://bgbilling-server.backpack.test:63081/billing/executer \
  module==DemoDynaction action==HelloWorld user==admin pswd==admin
```

Запрос:

```
GET /billing/executer?module=DemoDynaction&action=HelloWorld&user=admin&pswd=admin HTTP/1.1
Accept: */*
Accept-Encoding: gzip, deflate
Connection: keep-alive
Host: bgbilling-server.backpack.test:63081
User-Agent: HTTPie/1.0.3
```

Ответ:

```
HTTP/1.1 200 OK
Cache-control: no-cache, no-store, must-revalidate
Content-Type: text/xml;charset=UTF-8
Date: Sun, 10 Jan 2021 04:38:49 GMT
Expires: Thu, 01 Jan 1970 00:00:01 GMT
Last-Modified: Thu, 01 Jan 1970 00:00:01 GMT
Set-Cookie: JSESSIONID=BDCBDF187D500892F47DBB669DD59908; Path=/; HttpOnly
Transfer-Encoding: chunked
bgbilling-message: SGVsbG8sIFdvcmxkIQ==

<?xml version="1.0" encoding="UTF-8"?><data status="message">Hello, World!</data>
```

### Вызов HTTP POST

```
http --verbose --check-status --form \
  POST http://bgbilling-server.backpack.test:63081/billing/executer \
  module=DemoDynaction action=HelloWorld user=admin pswd=admin
```

Запрос:

```
POST /billing/executer HTTP/1.1
Accept: */*
Accept-Encoding: gzip, deflate
Connection: keep-alive
Content-Length: 60
Content-Type: application/x-www-form-urlencoded; charset=utf-8
Host: bgbilling-server.backpack.test:63081
User-Agent: HTTPie/1.0.3

module=DemoDynaction&action=HelloWorld&user=admin&pswd=admin
```

Ответ:

```
HTTP/1.1 200 OK
Cache-control: no-cache, no-store, must-revalidate
Content-Type: text/xml;charset=UTF-8
Date: Sun, 10 Jan 2021 04:38:49 GMT
Expires: Thu, 01 Jan 1970 00:00:01 GMT
Last-Modified: Thu, 01 Jan 1970 00:00:01 GMT
Set-Cookie: JSESSIONID=FC128D0E47307B9B49F66B6D20BC4277; Path=/; HttpOnly
Transfer-Encoding: chunked
bgbilling-message: SGVsbG8sIFdvcmxkIQ==

<?xml version="1.0" encoding="UTF-8"?><data status="message">Hello, World!</data>
```

## Микки Маус

В конфигурацию ядра добавьте:

```
# Dynaction: Микки Маус
# 
dynaction:DemoDynaction.ActionMickeyMouse=com.github.alexanderfefelov.bgbilling.dynaction.demo.MickeyMouse
#         │           │       │         │ │                                                              │
#         └─────┬─────┘       └────┬────┘ └──────────────────────────────┬───────────────────────────────┘
#               │                  │                                     │
#             module             action                                class
```

### Вызов HTTP POST

```
http --verbose --check-status --form \
  POST http://bgbilling-server.backpack.test:63081/billing/executer \
  module=DemoDynaction action=MickeyMouse user=admin pswd=admin
```

Запрос:

```
POST /billing/executer HTTP/1.1
Accept: */*
Accept-Encoding: gzip, deflate
Connection: keep-alive
Content-Length: 61
Content-Type: application/x-www-form-urlencoded; charset=utf-8
Host: bgbilling-server.backpack.test:63081
User-Agent: HTTPie/1.0.3

module=DemoDynaction&action=MickeyMouse&user=admin&pswd=admin
```

Ответ:

```
HTTP/1.1 200 OK
Cache-control: no-cache, no-store, must-revalidate
Content-Type: text/xml;charset=UTF-8
Date: Sun, 10 Jan 2021 06:30:39 GMT
Expires: Thu, 01 Jan 1970 00:00:01 GMT
Last-Modified: Thu, 01 Jan 1970 00:00:01 GMT
Set-Cookie: JSESSIONID=1EF449C1F8F3F900489DC355752FDE47; Path=/; HttpOnly
Transfer-Encoding: chunked

<?xml version="1.0" encoding="UTF-8"?>
<data status="ok">
    <mickeyMouse source="https://disneydiary.com/2018/09/how-to-say-mickey-mouse-in-27-different-languages/">
        <item id="Italian" title="Topolino"/>
        <item id="Slovak" title="Mysiak Mickey"/>
        <item id="Russian" title="Mikki Maus"/>
... skipped ...
        <item id="Spanish in Spain" title="El Ratón Mickey"/>
        <item id="Dutch" title="Mickey Mouse"/>
        <item id="Greek" title="Mikki Maous"/>
    </mickeyMouse>
</data>
```
