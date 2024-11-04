#!/bin/bash

if [ $# -ne 2 ]; then
  echo "Usage: $0 <num1> <num2>"
  exit 1
fi

# Run the main.java Java program
output=$(java main "$1" "$2")

# "Feature" handling
if echo "$output" | grep -q "The result (feature):"; then
  echo "Feature activated! Here is the special result:"
  echo "$output"
else
  echo "Something went wrong."
fi
