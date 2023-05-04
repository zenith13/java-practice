package stream;

import java.util.List;

/**
 * @author 002L1R744 on 11-01-2023
 */
public class CustomerData
{
    private String name;
    private List<String> numbers;

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public List<String> getNumbers()
    {
        return numbers;
    }

    public void setNumbers(final List<String> numbers)
    {
        this.numbers = numbers;
    }
}
