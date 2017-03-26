package com.github.jenkinslibraries

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}
