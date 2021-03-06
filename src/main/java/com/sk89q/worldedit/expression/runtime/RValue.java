// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldedit.expression.runtime;

import com.sk89q.worldedit.expression.Identifiable;

/**
 * A value that can be used on the right side of an assignment.
 *
 * @author TomyLobo
 */
public abstract class RValue implements Identifiable {
    private final int position;

    public RValue(int position) {
        super();
        this.position = position;
    }

    public abstract double getValue() throws EvaluationException;

    @Override
    public abstract String toString();

    public RValue optimize() throws EvaluationException {
        return this;
    }

    @Override
    public int getPosition() {
        return position;
    }
}
