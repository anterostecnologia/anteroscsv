package br.com.anteros.csv.reader;

import java.util.Collections;
import java.util.List;

/**
 * Class for holding a complete CSV file.
 *
 * @author Oliver Siegmar
 */
public final class AnterosCsvContainer {

    private final List<String> header;
    private final List<AnterosCsvRow> rows;

    AnterosCsvContainer(final List<String> header, final List<AnterosCsvRow> rows) {
        this.header = header;
        this.rows = rows;
    }

    /**
     * Returns the number of rows in this container.
     *
     * @return the number of rows in this container
     */
    public int getRowCount() {
        return rows.size();
    }

    /**
     * Returns the header row - might be {@code null} if no header exists.
     * The returned list is unmodifiable.
     *
     * @return the header row - might be {@code null} if no header exists
     */
    public List<String> getHeader() {
        return header;
    }

    /**
     * Returns a AnterosCsvRow by its index (starting with 0).
     *
     * @param index index of the row to return
     * @return the row by its index
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public AnterosCsvRow getRow(final int index) {
        return rows.get(index);
    }

    /**
     * Returns an unmodifiable list of rows.
     *
     * @return an unmodifiable list of rows
     */
    public List<AnterosCsvRow> getRows() {
        return Collections.unmodifiableList(rows);
    }

}
