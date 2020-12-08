# Ruby Projects



Run using docker

docker run --rm -v /Volumes/Aadhitya\ Mac\ Apps/Github/Dummy-Apps/ruby/:/usr/src -w /usr/src -ti ruby-on-rails bash


* By default yarn in a old version of `0.32`, so to update it we run
```bash
RUN apt-get update -qq && apt-get install -y curl && curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | apt-key add - && echo "deb https://dl.yarnpkg.com/debian/ stable main" | tee /etc/apt/sources.list.d/yarn.list && apt-get update && apt-get install -y yarn
```
We run this inside the container
