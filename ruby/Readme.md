# Ruby Projects



* Run using docker
```bash
docker run --rm -p 3000:3000 --expose 3000 -v /Volumes/Aadhitya\ Mac\ Apps/Github/Dummy-Apps/ruby/:/usr/src -w /usr/src -ti ruby-on-rails bash
```
and inside the container use `rails server --binding 0.0.0.0` to run the server.
To view the server go to `localhost:3000` to view the webpage.



* By default yarn in a old version of `0.32`, so to update it we run
```bash
apt-get update -qq && apt-get install -y curl && curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | apt-key add - && echo "deb https://dl.yarnpkg.com/debian/ stable main" | tee /etc/apt/sources.list.d/yarn.list && apt-get update && apt-get install -y yarn
```
We run this inside the container
