import time

#recursive
def count_numbers(phrase: str, tot =0) -> int:
    if len(phrase) == 0:
        return tot
    else:
        return count_numbers(phrase[1:], tot:= tot +1 if phrase[0].isnumeric() else tot)

#functional
def count_numbers2(phrase: str):
    chars = list(filter(lambda c : c.isnumeric(), phrase))
    return len(chars)


#imperative
def count_numbers3(phrase: str):
    count = 0

    for c in phrase:
        if c.isnumeric():
            count += 1

    return count

#list comprehension
def count_numbers4(phrase: str):
    return len([c for c in phrase if c.isnumeric()])

start = time.perf_counter_ns()
amount = count_numbers("123abc123")
end = time.perf_counter_ns()
print(f"RECURSIVE nanoseconds: {end-start}")

start = time.perf_counter_ns()
amount = count_numbers2("123abc123")
end = time.perf_counter_ns()
print(f"FUNCTIONAL nanoseconds: {end-start}")

start = time.perf_counter_ns()
amount = count_numbers3("123abc123")
end = time.perf_counter_ns()
print(f"IMPERATIVE nanoseconds: {end-start}")

start = time.perf_counter_ns()
amount = count_numbers4("123abc123")
end = time.perf_counter_ns()
print(f"LIST COMPREHENSION nanoseconds: {end-start}")