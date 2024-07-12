package com.erikachallenge.tools;

public record Request(String base_code,
                      String target_code,
                      Double conversion_rate) {
}
