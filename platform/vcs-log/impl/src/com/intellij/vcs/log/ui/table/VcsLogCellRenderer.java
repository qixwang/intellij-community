// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.vcs.log.ui.table;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Extends the capabilities of {@link javax.swing.table.TableCellRenderer} when displaying cells in the VCS Log
 *
 * @see com.intellij.vcs.log.ui.table.column.VcsLogColumn#createTableCellRenderer
 */
public interface VcsLogCellRenderer {
  default @Nullable VcsLogCellController getCellController() {
    return null;
  }

  /**
   * @return default width of the {@link com.intellij.vcs.log.ui.table.column.VcsLogColumn}.
   * If {@code null} and {@link com.intellij.vcs.log.ui.table.column.VcsLogColumn} returns {@link String}
   * in {@link com.intellij.vcs.log.ui.table.column.VcsLogColumn#getValue} then Log will calculate the width of column using some top rows,
   * otherwise preferred width will be used.
   */
  default @Nullable Integer getPreferredWidth(@NotNull JTable table) {
    return null;
  }
}
